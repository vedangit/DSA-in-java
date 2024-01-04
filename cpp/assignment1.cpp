

//Assignment#1
//Create class student with data members name and marks and show usage of class, object, static member, friend function//

#include <iostream>
#include <string>
using namespace std;

class student
{	
    string name;	
	int marks1, marks2;
	static int student_count;
	
	public:	
	
	student()
	{ 
	    student_count++;
	    
	}
	
	void getdata();
	friend void putdata(student);
	//{ cout<<"total object created:"<<student_count;}

static void count()
		{
		cout <<"Value of student count: " << student_count << endl;
		}

};
void student::getdata()
	{			
		cout<<"enter name";
		cin>> name;
		cout <<"enter marks";		
		cin>>marks1;
		cout <<"enter marks";		
		cin>>marks2;		
	}	
	
void putdata(student st1)
	{	cout << "Name : " << st1.name << endl;	
		cout << "Marks1 : " << st1.marks1 << endl;	
		cout << "Marks2 : " << st1.marks2 << endl;	
	}

int student::student_count=0; 

int main()
{	
    student st1;
    student st2;
    student st3;
    //to call static member
    st2.count();
    
    cout<<"Enter student1 data:"<<endl;
    st1.getdata();
    cout<<"student1 data:"<<endl;
	putdata(st1);

    cout<<"Enter student2 data:"<<endl;
    st2.getdata();
    cout<<"student2 data:"<<endl;
	putdata(st2);

    cout<<"Enter student3 data:"<<endl;
    st3.getdata();
    cout<<"student3 data:"<<endl;
	putdata(st3);
	return 0;
}
