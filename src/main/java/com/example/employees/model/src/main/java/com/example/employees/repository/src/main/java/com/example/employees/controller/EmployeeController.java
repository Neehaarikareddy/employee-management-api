@RestController
@RequestMapping("/employees")
public class EmployeeController {

@Autowired
EmployeeRepository repo;

@GetMapping
public List<Employee> getAll(){
 return repo.findAll();
}

@PostMapping
public Employee save(@RequestBody Employee e){
 return repo.save(e);
}

}
