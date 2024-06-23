-- Create table for User entity
CREATE TABLE IF NOT EXISTS users (
    userId BIGINT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(255) NOT NULL,
    userEmail VARCHAR(255) NOT NULL UNIQUE,
    userPassword VARCHAR(255) NOT NULL,
    isEmp BOOLEAN NOT NULL,
    isAdmin BOOLEAN NOT NULL,
    userMobile VARCHAR(255) NOT NULL UNIQUE,
    createdOn TIMESTAMP NOT NULL,
    lastLogin TIMESTAMP NOT NULL,
    companyId BIGINT,
    otpVerified BOOLEAN NOT NULL,
    EMPkey VARCHAR(255),
    CONSTRAINT fk_company FOREIGN KEY (companyId) REFERENCES company(companyId)
);

-- Create table for Company entity
CREATE TABLE IF NOT EXISTS company (
    companyId BIGINT AUTO_INCREMENT PRIMARY KEY,
    companyName VARCHAR(255) NOT NULL,
    empKey VARCHAR(255) NOT NULL UNIQUE,
    createdOn TIMESTAMP NOT NULL,
    lastLogin TIMESTAMP NOT NULL,
    adminUserId BIGINT NOT NULL UNIQUE,
    CONSTRAINT fk_adminUser FOREIGN KEY (adminUserId) REFERENCES users(userId)
);

-- Create table for Board entity
CREATE TABLE IF NOT EXISTS board (
    boardId BIGINT AUTO_INCREMENT PRIMARY KEY,
    isPersonal BOOLEAN NOT NULL,
    ownerId BIGINT NOT NULL,
    companyId BIGINT,
    createdOn TIMESTAMP NOT NULL,
    createdBy BIGINT NOT NULL,
    updatedOn TIMESTAMP NOT NULL,
    updatedBy BIGINT NOT NULL,
    CONSTRAINT fk_owner FOREIGN KEY (ownerId) REFERENCES users(userId),
    CONSTRAINT fk_company_board FOREIGN KEY (companyId) REFERENCES company(companyId),
    CONSTRAINT fk_createdBy FOREIGN KEY (createdBy) REFERENCES users(userId),
    CONSTRAINT fk_updatedBy FOREIGN KEY (updatedBy) REFERENCES users(userId)
);

-- Create table for Task entity
CREATE TABLE IF NOT EXISTS task (
    taskId BIGINT AUTO_INCREMENT PRIMARY KEY,
    summary VARCHAR(255) NOT NULL,
    description TEXT,
    assigneeId BIGINT NOT NULL,
    boardId BIGINT NOT NULL,
    createdOn TIMESTAMP NOT NULL,
    createdBy BIGINT NOT NULL,
    updatedOn TIMESTAMP NOT NULL,
    updatedBy BIGINT NOT NULL,
    stageId BIGINT NOT NULL,
    CONSTRAINT fk_assignee FOREIGN KEY (assigneeId) REFERENCES users(userId),
    CONSTRAINT fk_board FOREIGN KEY (boardId) REFERENCES board(boardId),
    CONSTRAINT fk_createdBy_task FOREIGN KEY (createdBy) REFERENCES users(userId),
    CONSTRAINT fk_updatedBy_task FOREIGN KEY (updatedBy) REFERENCES users(userId),
    CONSTRAINT fk_stage FOREIGN KEY (stageId) REFERENCES stage_master(stageId)
);

-- Create table for Stage_master entity
CREATE TABLE IF NOT EXISTS stage_master (
    stageId BIGINT AUTO_INCREMENT PRIMARY KEY,
    stageName VARCHAR(255) NOT NULL
);

-- Create table for OTP_verification entity
CREATE TABLE IF NOT EXISTS otpVerification (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mobileNumber VARCHAR(255) NOT NULL,
    userId BIGINT NOT NULL,
    otp VARCHAR(255) NOT NULL,
    isVerified BOOLEAN NOT NULL,
    updatedOn TIMESTAMP NOT NULL,
    updatedBy BIGINT NOT NULL,
    dueDate TIMESTAMP NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (userId) REFERENCES users(userId),
    CONSTRAINT fk_updatedBy_otp FOREIGN KEY (updatedBy) REFERENCES users(userId)
);

-- Create join table for many-to-many relationship between Board and Stage_master
CREATE TABLE IF NOT EXISTS board_stages (
    boardId BIGINT NOT NULL,
    stageId BIGINT NOT NULL,
    PRIMARY KEY (boardId, stageId),
    CONSTRAINT fk_board_stage FOREIGN KEY (boardId) REFERENCES board(boardId),
    CONSTRAINT fk_stage_board FOREIGN KEY (stageId) REFERENCES stage_master(stageId)
);
