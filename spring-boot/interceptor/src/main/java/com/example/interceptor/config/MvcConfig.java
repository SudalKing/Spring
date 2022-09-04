package com.example.interceptor.config;

import com.example.interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor // private final 객체를 생성자에서 주입받도록 해줌
public class MvcConfig implements WebMvcConfigurer {

    // @Autowired << 순환참조가 일어날 수 있으므로 @Required~ 선호
    private final AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor).addPathPatterns("/api/private/*"); // 이 경로에서만 권한검사를 하겠다!
        // registry.addInterceptor()  << 계속 추가 가능하며 작성한 순서대로 타게됨
    }
}
