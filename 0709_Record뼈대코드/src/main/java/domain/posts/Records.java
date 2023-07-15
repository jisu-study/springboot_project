

@Getter
@NoArgsConstructor
@Entity
public class Records extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column(length = 500, nullable = true)
    private int cost;
    //private Cost cost; - 다른 Cost클래스(테이블) 있을때

    @Column(length = 255, nullable = false)
    private String record_title;

    @Column(nullable=false)
    private String location;

    @Column(nullable = false)
    private LocalDate start_date;

    @Column(nullable = false)
    private LocalDate end_date;

    /*@Column(columnDefinition = "TEXT", nullable = false)
    private String content;*/


    @Builder
    public Records(int cost_id, String record_title, String location, Date start_date, Date end_date) {
        this.cost_id = cost_id;
        this.record_title = record_title;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public void update(Long cost_id, String record_title, String location, Date start_date, Date end_date) {
        this.cost_id = cost_id;
        this.record_title = record_title;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
