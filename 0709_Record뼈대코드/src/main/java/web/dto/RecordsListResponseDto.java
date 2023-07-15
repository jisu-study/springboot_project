//Dto들 구조
/*

@Getter
@NoArgsConstructor
public class RecordsSaveRequestDto {

    private 필요한 속성들

    @Builder
    public RecordsSaveRequestDto(타입 속성명){
       this.속성 = 속성

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

* RecordContent에 대해서도 똑같이.
*
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

*
*
* */