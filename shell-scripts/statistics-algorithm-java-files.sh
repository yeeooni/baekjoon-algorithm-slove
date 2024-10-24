#! /usr/bin/bash

TODAY=$(date +%Y-%m-%d)
PERIODS=("yesterday" "7 days ago" "30 days ago")
LABELS=("Yesterday" "Last 7 Days" "Last 30 Days")
COUNTS=()

# src 디렉토리의 모든 .java 파일을 찾음
JAVA_FILES=$(find src -type f -name "*.java")

# 각 기간에 대해 통계 계산
for i in "${!PERIODS[@]}"; do
    START_DATE=$(date -d "${PERIODS[$i]}" +%Y-%m-%d)
    END_DATE=$TODAY
    echo "Checking Java files committed between $START_DATE and $END_DATE:"

    COUNT=0
    for FILE in $JAVA_FILES; do
        # 처음 파일을 커밋한 시점
        FIRST_COMMIT_DATE=$(git log --diff-filter=A --follow --format="%ad" --date=short -- "$FILE" | tail -n 1)
        echo "File: $FILE, First Commit Date: $FIRST_COMMIT_DATE"

        # 날짜를 타임스탬프로 변환하여 비교 (초 단위로)
        START_TIMESTAMP=$(date -d "$START_DATE" +%s)
        END_TIMESTAMP=$(date -d "$END_DATE" +%s)
        COMMIT_TIMESTAMP=$(date -d "$FIRST_COMMIT_DATE" +%s)

        # 첫 커밋 날짜가 지정된 기간 내에 있는지 확인
       if [[ "$COMMIT_TIMESTAMP" -ge "$START_TIMESTAMP" && "$COMMIT_TIMESTAMP" -le "$END_TIMESTAMP" ]]; then
          echo "$FILE was first committed within the period."
          COUNT=$((COUNT+1))
       else
           echo "$FILE was not first committed within the period."
       fi

    done

    COUNTS+=($COUNT)
    echo "${LABELS[$i]} Created Count: $COUNT"
done

# 결과 출력
DAILY_COUNT=${COUNTS[0]}
WEEKLY_COUNT=${COUNTS[1]}
MONTHLY_COUNT=${COUNTS[2]}

echo -e "\e[31m+==================COUNT===================+";
echo -e "\e[32mJava Files Created Yesterday:    ${DAILY_COUNT}"
echo -e "\e[32mJava Files Created Last 7 Days:  ${WEEKLY_COUNT}"
echo -e "\e[32mJava Files Created Last 30 Days: ${MONTHLY_COUNT}"
echo -e "\e[31m+==================COUNT===================+";

# GitHub Actions 의 GITHUB_OUTPUT 파일에 값을 기록
echo "TODAY=${TODAY}" | tee -a $GITHUB_ENV 2> /dev/null
echo "DAILY_COUNT=${DAILY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null
echo "WEEKLY_COUNT=${WEEKLY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null
echo "MONTHLY_COUNT=${MONTHLY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null

