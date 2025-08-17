package com.xworkz.springprotal.entity;

import com.xworkz.springprotal.enm.Track;
import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "conference_paper_submission")
public class ConferencePaperSubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String authorName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 10)
    private long phone;

    @Column(nullable = false, length = 200)
    private String paperTitle;

    @Column(nullable = false, length = 2000)
    private String abstractText;

    @Column(nullable = false, length = 200)
    private String keywords;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Track track;

    @Column(name = "published_at")
    private Timestamp publishedAt;
}
