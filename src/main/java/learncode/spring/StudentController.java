package learncode.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/student/form")
	public String showForm() {
		return "student-form";
	}

	@GetMapping("/student/save")
	public String showData(HttpServletRequest request, ModelMap model) {
		String name = request.getParameter("name");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		model.addAttribute("NAME", "Họ và tên: " + name);
		model.addAttribute("MARK", "Điểm trung bình: " + mark);
		model.addAttribute("MAJOR", "Chuyên ngành: " + major);
		return "student-infor";
	}
}
