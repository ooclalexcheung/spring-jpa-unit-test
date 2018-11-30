package com.oocl.web.sampleWebApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SingleEntityTest {
    @Autowired
    private SingleEntityRepository singleEntityRepository;

    @Test
    public void should_fetch_entity(){
        //Given
        SingleEntity singleEntity = new SingleEntity();
        singleEntity.id = 1L;
        singleEntity.name="HelloWorld";
        singleEntityRepository.save(singleEntity);

        //When
        final SingleEntity fetched = singleEntityRepository.getOne(1L);

        //Then
        assertEquals("HelloWorld",fetched.name);
    }
}
