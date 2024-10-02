package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl1 {
    public void printService(String str,int n){
        System.out.println("Name of the API Test is  : " +str + " and API route is /test"+n);
    }

    public void classObjImpl(){
        System.out.println("Inside ServiceImpl1");
    }
}
