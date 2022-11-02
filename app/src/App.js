import React from 'react';
import './App.css';
import { Header } from './Components/Header/Header';
import { Main } from './Components/Mainpage/Main';
import { Auth } from './Components/Auth/Auth';

function App() {
  // localStorage.removeItem('isAuth')
  if (!localStorage.getItem('isAuth')) {
    return (
      <div className='container'>
        <Header />
        <div className='main'>
          <Auth />
        </div>
      </div>

    )
  } else {
    return (
      <div className='container'>
        <Header />
        <Main />
      </div>

    )
  }


}

export default App;