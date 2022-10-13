import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  angForm: FormGroup;
  newuser = new User();

  errorPassword: boolean = false;
  successMessage: string = '';
  constructor(private fb: FormBuilder, private userservice: UserService, private router: Router) {
    this.angForm = this.fb.group({
      password: ['', Validators.required],
      userid: ['', Validators.required]
    });
  }
  ngOnInit(): void {
  }


  postdata1(angForm1: { value: { userid:any; password: any; }; }) {
    this.newuser.userid = angForm1.value.userid;
    this.newuser.password = angForm1.value.password;
    // console.log("from login comp");

    if(this.validate()){
      this.userservice.userlogin(this.newuser).subscribe(
        (res: any) => {
          // console.log('logged in successfully: ' );
          // console.log(res);
          // this.userservice.currentuser = res;
          this.userservice.setToken(this.newuser.userid);
          this.router.navigate(['homepage']);
          // alert(this.userservice.getToken());
        }, (err: any) => {
          this.successMessage = "Wrong Credentials";
        }
      );
    }
    else {
      this.successMessage = "Wrong Credentials";
      return
    }
    
}
private validate(): boolean {
  // if (!this.username.length) {
  //   this.errorUsername = true;
  // } else {
  //   this.errorUsername = false;
  // }
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
  if(pass.length ==0) return false;
  else return true;
}

  toRegister(){
    this.router.navigate(['signup']);
  }

}
