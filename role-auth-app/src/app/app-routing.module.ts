import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
  {
    path:'admin',
    canActivate:[AuthGuard],
    loadChildren:()=>import('./administration/administration.module').then(m=>m.AdministrationModule)
  },
  {
    path:'general',
    loadChildren:()=>import('./general/general.module').then(m=>m.GeneralModule)
  },
  {
    path:'manager',
    loadChildren:()=>import('./management/management.module').then(m=>m.ManagementModule)
  },
  {path:'',redirectTo:'login',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
