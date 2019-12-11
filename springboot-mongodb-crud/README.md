# Prashanth

				    Mongo DB
Download & Install Mongo DB :
https://www.mongodb.com/download-center/community
Step 1) Go to " C:\Program Files\MongoDB\Server\4.0\bin" and double click on mongo.exe. Alternatively, you can also click on the MongoDB desktop item : MongoDB Compass Community
> var myMessage='Hello World';
> printjson(myMessage);
"Hello World"


If you don't have above DB parameters, you can use below db.createuser()

use test_db

db.createUser( { user: "root",
                 pwd: "root",
                 roles: [ { role: "readWrite", db: "db_test" }],
                   } );
OR else you can work with admin user.

db.createUser(
  {
    user: 'admin',
    pwd: 'password',
    roles: [ { role: 'root', db: 'admin' } ]
  }
);
