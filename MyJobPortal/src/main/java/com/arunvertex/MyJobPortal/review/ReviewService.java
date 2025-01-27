package com.arunvertex.MyJobPortal.review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReviews(Long companyId, Review review);

    boolean updateReviews(Long companyId, Long reviewId, Review review);

    Review getReview(Long companyId, Long reviewId);
}
