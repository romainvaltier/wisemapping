ALTER TABLE User 
ADD COLUMN `google_sync` BOOLEAN NULL,
ADD COLUMN `sync_code` VARCHAR(255) NULL,
ADD COLUMN `google_token` VARCHAR(255) NULL;
