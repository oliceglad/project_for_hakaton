
import React, {Component} from 'react';
import './App.css';
import { Auth } from './Components/Auth/Auth';
import { Header } from './Components/Header/Header';
import { Main } from './Components/Mainpage/Main';

class App extends Component {

render() {


  return (
    <div className='container'>
      <Header/>
      <div className='main'>
        {/* <Auth/> */}
        <Main/>
      </div>
    </div>
  )
}


}

export default App;