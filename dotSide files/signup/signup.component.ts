
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  angForm: FormGroup;
  newuser = new User();
  errorPassword: boolean = false;
  successMessage: string = '';
  emailregexerror: boolean = false;
  emailregex : RegExp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

  constructor(private fb: FormBuilder, private userservice: UserService, private router: Router) {
    this.angForm = this.fb.group({
      email: ['', [Validators.required, Validators.minLength(1), Validators.email]],
      password: ['', Validators.required],
      name: ['', Validators.required],
      phone: ['', Validators.required],
      userid: ['', Validators.required]
    });
  }
  ngOnInit(): void {
  }

  postdata(angForm1: { value: { name: any; userid: any; email: any; phone: any; password: any; }; }) {
   // this.userservice.userregistration(angForm1.value.name, angForm1.value.email, angForm1.value.password);
      this.newuser.name = "firsname";
      this.newuser.userid = angForm1.value.userid;
      this.newuser.email = angForm1.value.email;
      this.newuser.password = angForm1.value.password;
      this.newuser.phone = "1";

      // if(!this.newuser.name || !this.newuser.userid || !this.newuser.email || !this.newuser.password || !this.newuser.phone){
      //   alert("Please fill up all credentials");
      // }
      if(this.validate()){
        this.userservice.userregistration(this.newuser).subscribe(
          (res: any) => {
            // console.log('hello')
            // console.log(res);
            // alert("Registration Successfull")
            this.successMessage = "Registration Successfull";

            this.router.navigate(['login']);
          }, (err: any) => {
            alert('Try again');
          }
        );
      }
      else {
        this.successMessage = "Error occurred";
        return
      }

    }
    private validate(): boolean {
      // if (!this.username.length) {
      //   this.errorUsername = true;
      // } else {
      //   this.errorUsername = false;
      // }
      if(this.emailregex.test(this.newuser.email)==false){
        this.emailregexerror = true;
        return false;
      }
      if (!this.checkpasslength(this.newuser.password)) {
        this.errorPassword = true;
      } else {
        this.errorPassword = false;
      }
      if (!this.errorPassword) {
        return true;
      }

      return false;
    }

    checkpasslength(pass:String){
      if(pass.length < 4) return false;
      else return true;
    }

    toLogin(){
      this.router.navigate(['login']);
    }
}
