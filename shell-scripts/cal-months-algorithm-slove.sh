#!/bin/bash

# 오늘 날짜를 가져옵니다.
TODAY=$(date +%Y-%m-%d)

# 사용자가 몇 개월 전부터 확인할지 입력받습니다.
MONTHS_AGO=$1

# 6개월 전부터 현재까지의 Java 파일 최초 커밋 수 카운트
START_DATE=$(date -d "${MONTHS_AGO} months ago" +%Y-%m-%d)
TODAY=$(date +%Y-%m-%d)

# 최초 커밋 개수를 저장할 변수 초기화
FIRST_COMMIT_COUNT=$(git ls-files "*.java" | while read file; do
    # 파일의 최초 커밋 날짜 조회
    FIRST_COMMIT_DATE=$(git log --follow --diff-filter=A --format="%cs" -- "$file" | tail -n 1)

    # 최초 커밋 날짜가 6개월 이내라면 해당 파일을 출력
    if [[ "$FIRST_COMMIT_DATE" -g "$START_DATE" && "$FIRST_COMMIT_DATE" -le "$TODAY" ]]; then
        echo "$file 최초 커밋 날짜: $FIRST_COMMIT_DATE"
    fi
done | wc -l)

# 결과 출력
echo "${MONTHS_AGO}개월 전부터 지금까지 생성된 자바 파일 수: ${FIRST_COMMIT_COUNT}개"

# GitHub Actions 에서 사용할 환경 변수 파일에 기록
echo "MONTHS_AGO=$MONTHS_AGO" >> $GITHUB_ENV
echo "FIRST_COMMIT_COUNT=$FIRST_COMMIT_COUNT" >> $GITHUB_ENV