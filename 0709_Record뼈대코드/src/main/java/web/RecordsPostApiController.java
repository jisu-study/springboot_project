import java.util.List;

@RequiredArgsConstructor
@RestController
public class RecordsApiController {

    private final RecordsService RecordsService;

    @PostMapping("/api/v1/Records")
    public Long save(@RequestBody RecordsSaveRequestDto requestDto) {
        return RecordsService.save(requestDto);
    }

    @PutMapping("/api/v1/Records/{record_record_id}")
    public Long update(@PathVariable Long record_id, @RequestBody RecordsUpdateRequestDto requestDto) {
        return RecordsService.update(record_id, requestDto);
    }

    @DeleteMapping("/api/v1/Records/{record_id}")
    public Long delete(@PathVariable Long record_id) {
        RecordsService.delete(record_id);
        return record_id;
    }

    @GetMapping("/api/v1/Records/{record_id}")
    public RecordsResponseDto findByRecordId(@PathVariable Long record_id) {
        return RecordsService.findByRecordId(record_id);
    }

    @GetMapping("/api/v1/Records/list")
    public List<RecordsListResponseDto> findAll() {
        return RecordsService.findAllDesc();
    }
}
