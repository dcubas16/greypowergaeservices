package org.greypowergaeservices.restful;

import org.greypowergaeservices.test.util.TestConfigurator;
import org.greypowergaeservices.test.util.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestContext.class, WebAppContext.class })
@WebAppConfiguration
public class WhenCallProductService {

	private MockMvc mockMvc;

	@Test
	public void findAll_TodosFound_ShouldReturnFoundTodoEntries()
			throws Exception {

		when(Mockito.mock(int.class)).thenReturn(1);

		mockMvc.perform(get("/api/todo"))
				.andExpect(status().isOk())
				.andExpect(
						content().contentType(TestUtil.APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$", hasSize(2)));

//		verify(Prueba(), times(1)).findAll();
//		verifyNoMoreInteractions(todoServiceMock);
	}

	public int Prueba() {
		return 1;
	}
}
