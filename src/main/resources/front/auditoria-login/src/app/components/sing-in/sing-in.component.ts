import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
export class People {
  id: number
  firstName: string
  lastName: string
  login: string
  password: string
}

@Component({
  selector: 'app-sing-in',
  templateUrl: './sing-in.component.html',
  styleUrls: ['./sing-in.component.scss']
})
export class SingInComponent implements OnInit {

  form: FormGroup;

  constructor(
    private formBuilder: FormBuilder
  ) { }

  ngOnInit(): void {
    this.createForm(new People());
  }

  createForm(people: People) {
    this.form = this.formBuilder.group({
      id: people.id,
      firstName: people.firstName,
      lastName: people.lastName,
      login: people.login,
      password: people.password
    })
  }

  sendPeople(){
    console.log(this.form.controls.firstName.value);
  }

}
