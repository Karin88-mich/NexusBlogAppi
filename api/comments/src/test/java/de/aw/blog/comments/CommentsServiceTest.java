package de.aw.blog.comments;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;


//import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
public class CommentsServiceTest {

	@Mock
	CommentsRepository  commentsRepository;
	
	@InjectMocks
	CommentsService unitUnderTest;//= new CommentsService
	
	
	@DisplayName("When /api/post/1/comments is called Then 3 comments are returned")
	@Test
	public void returnComments() {
		
		//when(commentsRepository.findAll()).then(Arrays.asList(new Comment);
		List<Comment>resultToCheck = unitUnderTest.getCommentsByPostId(1);
		assertThat(resultToCheck).hasSize(3);
	}
}
