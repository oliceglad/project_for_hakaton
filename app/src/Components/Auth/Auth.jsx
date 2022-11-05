import React, {  useState, useEffect } from 'react';
import a from './Auth.module.scss';

export const Auth = () => {
  const [title, setTitle] = useState('')
  const [titleTwo, setTitleNew] = useState('')
  const [isAuth, setIsAuth] = useState(false)

  useEffect(() => {
    setIsAuth(localStorage.getItem('isAuth'))
  }, [])

  function addToStorage(isAuth) {
    localStorage.setItem('isAuth', isAuth);
  }

  const dictions = {
    login: 'admin',
    password: '123'
  }

  function handleSubmit() {
    if (title === dictions.login && titleTwo=== dictions.password) {
      setIsAuth(true)
      addToStorage()
    } 

    
    console.log(isAuth)

    return isAuth
  }

  return (
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
  )
}