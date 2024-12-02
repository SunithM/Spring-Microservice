CREATE TABLE IF NOT EXISTS `customer`
(
    customer_id   BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    mobile_number VARCHAR(255) NOT NULL,
    created_at    DATE         NOT NULL,
    created_by    VARCHAR(255) NOT NULL,
    updated_at    DATE         DEFAULT NULL,
    updated_by    VARCHAR(255) DEFAULT NULL
);


CREATE TABLE IF NOT EXISTS `accounts`
(
    customer_id    BIGINT       NOT NULL,
    account_number INT AUTO_INCREMENT PRIMARY KEY,
    account_type   VARCHAR(255) NOT NULL,
    branch_address VARCHAR(255) NOT NULL,
    created_at     date         NOT NULL,
    created_by     VARCHAR(255) NOT NULL,
    updated_at     date         Default NULL,
    updated_by     VARCHAR(255) Default NULL
);

