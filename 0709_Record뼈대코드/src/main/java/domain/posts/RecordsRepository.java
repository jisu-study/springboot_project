public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    //어떤 쿼리가 들어가야할까
    List<Records> findAllDesc();


}