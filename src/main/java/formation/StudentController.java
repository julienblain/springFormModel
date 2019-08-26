/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService; //pas de new car la config student-servelet l'instancie 
    }

    public StudentService getStudentService() {
        return studentService;
    }

    //ce type d'objet permet d'avoir une structure composite (vue et l'objet
    @RequestMapping(value = "/student", method = RequestMethod.GET) //envoie du formulaitre
    public ModelAndView student() {
        /*si on veut seter des value dans le forme
        Student s = new Student();
        s.setName("essai");
         ModelAndView mv = new ModelAndView("student", "command", s);
         */
        ModelAndView mv = new ModelAndView("student", "command", new Student()); //student = vue ; command = modelAndViewName, new Student = model
        mv.getModelMap().addAttribute("countryList", studentService.getAllCountries());
        mv.getModelMap().addAttribute("interestList", studentService.getAllInterets());
        return mv;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST) //formulaire validé
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        model.addAttribute("country", studentService.getAllCountries().get(Integer.parseInt(student.getCountry())-1).getCountryName());
        model.addAttribute("interestList", student.getInterestList());
        return "result";
    }
}
