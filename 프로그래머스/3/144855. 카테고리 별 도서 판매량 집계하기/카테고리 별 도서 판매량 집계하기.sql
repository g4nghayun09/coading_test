-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) AS TOTAL_SALES
FROM BOOK AS b
inner JOIN BOOK_SALES AS s
ON b.BOOK_ID = s.BOOK_ID
and s.SALES_DATE >= "2022-01-01"
and s.SALES_DATE < "2022-02-01"
group by b.category
order by b.category asc
;