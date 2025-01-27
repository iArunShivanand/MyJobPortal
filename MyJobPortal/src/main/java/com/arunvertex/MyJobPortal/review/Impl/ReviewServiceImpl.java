package com.arunvertex.MyJobPortal.review.Impl;

import com.arunvertex.MyJobPortal.review.Review;
import com.arunvertex.MyJobPortal.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> getAllReviews(Long companyId) {
        return List.of();
    }

    @Override
    public boolean addReviews(Long companyId, Review review) {
        return false;
    }

    @Override
    public boolean updateReviews(Long companyId, Long reviewId, Review review) {
        return false;
    }

    @Override
    public Review getReview(Long companyId, Long reviewId) {
        return null;
    }
}
