<?php

function pdo_connect() {
    try {
        // Production Server
        $dbhost="mysql:host=mysql-user.cse.msu.edu;dbname=dittmank";
        $user="dittmank";
        $password="rdelatable";
        return new PDO($dbhost,$user,$password);
    } catch (PDOException $e) {
        die ("Unable to select database");
    }
}