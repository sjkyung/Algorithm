-- 코드를 작성해주세요
WITH ParentChild AS (
    SELECT
        child.ID AS child_id,
        child.GENOTYPE AS child_genotype,
        parent.ID AS parent_id,
        parent.GENOTYPE AS parent_genotype
    FROM
        ECOLI_DATA child
    JOIN
        ECOLI_DATA parent
    ON
        child.PARENT_ID = parent.ID
)
SELECT
    child_id AS ID,
    child_genotype AS GENOTYPE,
    parent_genotype AS PARENT_GENOTYPE
FROM
    ParentChild
WHERE
    (child_genotype & parent_genotype) = parent_genotype
ORDER BY
    child_id;