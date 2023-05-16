package com.aditya.bookservice.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "BOOKS_INFO_TABLE")
public class Book {
    @DynamoDBHashKey(attributeName = "BookId")
    private String bookId;
    @DynamoDBAttribute(attributeName = "BookTitle")
    private String bookTitle;
    @DynamoDBAttribute(attributeName = "BookImageUrl")
    private String bookImageUrl;
    @DynamoDBAttribute(attributeName = "bookPrice")
    private Double bookPrice;

}
