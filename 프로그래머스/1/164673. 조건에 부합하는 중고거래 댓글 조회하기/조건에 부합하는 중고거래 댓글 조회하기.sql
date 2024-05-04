-- 코드를 입력하세요
SELECT A.TITLE, A.BOARD_ID,B.REPLY_ID, B.WRITER_ID, B.CONTENTS, DATE_FORMAT(B.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD A
JOIN USED_GOODS_REPLY B ON A.BOARD_ID = B.BOARD_ID
WHERE 
A.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY B.CREATED_DATE ASC ,A.TITLE ASC;