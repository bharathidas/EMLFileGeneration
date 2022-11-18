ALTER TABLE "emlfilegeneration$email" DROP COLUMN "email";
ALTER TABLE "emlfilegeneration$email" DROP COLUMN "messageid";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '7734778f-a1d0-4cef-9a62-9381c38adaea';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'b34e3bec-b4f6-438c-ba84-b73376a61783';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221117 13:54:34';
