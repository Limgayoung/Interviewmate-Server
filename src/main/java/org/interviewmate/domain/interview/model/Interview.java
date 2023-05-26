package org.interviewmate.domain.interview.model;

import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.interviewmate.domain.analysis.model.GazeAnalysis;
import org.interviewmate.domain.analysis.model.PoseAnalysis;
import org.interviewmate.domain.user.model.User;
import org.interviewmate.global.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "interview")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Interview extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private Long score;

    private Double videoDuration;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pose_analysis_id")
    private PoseAnalysis poseAnalysis;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gaze_analysis_id")
    private GazeAnalysis gazeAnalysis;

    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL,  orphanRemoval = true)
    private List<InterviewVideo> interviewVideos;

    @Builder
    public Interview(User user) {
        this.user = user;
    }

    public void setAnalysis(PoseAnalysis poseAnalysis, GazeAnalysis gazeAnalysis) {
        this.poseAnalysis = poseAnalysis;
        this.gazeAnalysis = gazeAnalysis;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

}
