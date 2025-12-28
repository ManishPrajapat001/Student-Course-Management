Q1.Why you used ArrayList instead of array?     
A1.When we declare an array,we must know the size in advance.If we create a large array but only store a few elements,memory gets wasted.And if we later need to increase the size,we have to manually create a new array and copy the elements,which is inefficient.On the other hand, an ArrayList is dynamic in size.It can automatically grow or shrink as needed,making it easier and more flexible to use.

Q2.Where you used static members and why?   
A2. I used static members where i don't want to create an instance of that class but want to utilize the functionalities/methods/attributes of the class.Also for those attributes which i want comman for all the instances of that class.I have used static extensively ,for example for methods of CourseManagementService,EnrollmentManagementService ,etc..

Q3.Where you used inheritance and what you gained from it?      
A3.I have used inheritance in student and person entity.I have created child class for person ,in form of Student and trainer.So that i don't have to declare some comman attributes in both class separately and their methods,one comman function will do the task.