package com.dlim2012.clients.shorturl.dto;

public record UrlDeleteRequest (
        String shortUrlPath,
        Boolean isPrivate,
        String userEmail
){
}
