package webadv.p6;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    List<String> tasks =Arrays.asList("����ƪ���µ�д��Ŀ�ģ��������ڷ��ϼܹ�ԭ���ǰ���£���������������Ϊ������Ӧ������ļܹ���ƣ�"
    		+ "�õ�һ������ǿ�����ܺá�����ͨ�ŵļܹ���RESTָ����һ��ܹ�Լ��������ԭ��"
    		,"REST������\"���ֲ�״̬ת��\"�У�ʡ�������\"���ֲ�\"��ʵָ����\"��Դ\"��Resources����\"���ֲ�\"��","RESTful�ܹ�������Ŀǰ�����е�һ�ֻ���������ܹ������ṹ���������ϱ�׼��������⡢��չ���㣬�������õ�Խ��Խ����վ�Ĳ��á�",
    		"ielding��һ���ǳ���Ҫ���ˣ�����HTTPЭ�飨1.0���1.1�棩����Ҫ����ߡ�Apache���������������֮һ��Apache�����ĵ�һ����ϯ��",
    		"Fielding�����Ի���������ļܹ�ԭ�򣬶���ΪREST����Representational State Transfer����д���Ҷ��������ķ�����\"���ֲ�״̬ת��\"",
    		"���һ���ܹ�����RESTԭ�򣬾ͳ���ΪRESTful�ܹ���"+"Jquery��һ������Javascript��ܣ��Ǽ�Prototype֮����һ�������JavaScript����⣨��JavaScript��ܣ���Jquery����ּ�ǡ�write Less, DO More��,������д���ٵĴ��룬�����������");
	@GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }

}

