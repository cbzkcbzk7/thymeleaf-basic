package hello.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName    : hello.thymeleafbasic.basic
 * fileName       : TemplateController
 * author         : Sora
 * date           : 2024-06-18
 * description    : Template
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-18        Sora       최초 생성
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

    /**
     * 템플릿 조각가져와서 사용하기
     * @return
     */
    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }

    /**
     * 코드 조각을 레이아웃에 넘겨서 사용
     * @return
     */
    @GetMapping("/layout")
    public String layout(){
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend")
    public String layoutExtend(){
        return "template/layoutExtend/layoutExtendMain";
    }
}
