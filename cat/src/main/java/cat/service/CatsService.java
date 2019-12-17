package cat.service;

import cat.dto.CatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatsService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${cats.get.request.url}")
    private String catsGetRequestUrl;

    public CatDto getCat() {
        return restTemplate.getForEntity(catsGetRequestUrl, CatDto[].class).getBody()[0];
    }
}