package kr.co.dineout.eatgo.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class RestaurnatControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        mvc.perform(get("/restaurant"))
                .andExpect(status().isOk());
    }

}