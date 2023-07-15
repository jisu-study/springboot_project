//여기 안에 Records와 RecordContent Save관련된걸 같이

@Getter
@NoArgsConstructor
public class RecordsSaveRequestDto {

    private Cost cost_id;
    private String record_title;
    private String location;
    private Date start_date;
    private Date end_date;
    private List<RecordContentSaveRequestDto> recordContents;

    @Builder
    public RecordsSaveRequestDto(Strint record_title, String location){
        //여기서 얼마나 만든단건지 모르겠네
        this.record_title = record_title;
        this.location = location;

    }

    public Records toEntity(){
        //DTO 객체를 엔티티 객체로 변환
        return Records.builder()
                .record_title(record_title)
                .location(location)
                //.뭐가 더들어갈까. 위랑 연동
                .build();
    }

}

@Getter
@NoArgsConstructor
public class RecordContentSaveRequestDto {

    private Integer date; // 우리 스키마에 int라 되어있음. 여행일자들 date로 하는거아님? 뭐더라
    private String content;
    private String hashtag;

    public RecordContent toEntity(){
        return RecordContent.builder()
                .date(date)
                .content(content)
                .hashtag(hashtag)
                .build();
    }


}
