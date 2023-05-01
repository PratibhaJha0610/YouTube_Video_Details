package org.example.spring.auth.record;

public record SearchListResponse(String kind, String etag, String nextPageToken, String prevPageToken, PageInfo pageInfo,
                                 SearchResult[] items) {
}
