@Getter
public class RecordsResponseDto {

    private int record_id;
    private Cost cost_id;
    private String record_title;
    private String location;
    private Date start_date;
    private Date end_date;

    public RecordsResponseDto(Records entity) {
        this.record_id = entity.getRecordId();
        this.cost = entity.getCost();
        this.record_title = entity.getRecordTitle();
        this.location = entity.getLocation();
        this.start_date = entity.getStartDate();
        this.end_date = entity.getEndDate();
    }
}