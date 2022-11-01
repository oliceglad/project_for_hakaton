import React, {useEffect, useState } from 'react';
import './App.css';
import { Header } from './Components/Header/Header';
import { Main } from './Components/Mainpage/Main';
import a from '././/Components/Auth/Auth.module.scss';

function App() {
  const [title, setTitle] = useState('')
  const [titleTwo, setTitleNew] = useState('')
  const [isAuth, setIsAuth] = useState(false)

  function addToStorage(isAuth) {
    localStorage.setItem('isAuth', isAuth);
  }

  useEffect(() => {
    const item = localStorage.getItem('isAuth');
    if (item) {
      setIsAuth(item)
    }
  }, [])


  const dictions = {
    login: 'admin',
    password: '123'
  }

  function handleSubmit() {

    if (title === dictions.login && titleTwo === dictions.password) {
      setIsAuth(true) 
    }
    
    addToStorage()
    return isAuth
  }

  if (!isAuth) {
    return (
      <div className='container'>
        <Header />
        <div className='main'>
          <form className={a.auth__form}>
            <input
              placeholder="Логин"
              className={a.auth__form__input}
              type="text"
              value={title}
              onChange={event => setTitle(event.target.value)}
            />
            <input
              placeholder="Пароль"
              className={a.auth__form__input}
              type="password"
              value={titleTwo}
              onChange={event => setTitleNew(event.target.value)}
            />
            <button type="submit" className={a.auth__form__button} onClick={handleSubmit}>
              Войти
            </button>
          </form>
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