import React, {useState} from 'react';
import a from './Auth.module.scss';

export const Auth = ({isAuth}) => {
    const [title, setTitle] = useState('')
    const [titleTwo, setTitleNew] = useState('')

    function handleSubmit(e) {

        const dictions = {
            login: "admin",
            password: "123"
        }

        if (title == dictions.login && titleTwo === dictions.password) {
            isAuth = true;
        }

        return isAuth
    }

    return (
        <form className={a.auth__form} onSubmit={handleSubmit} >
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
                type="text"
                value={titleTwo}
                onChange={event => setTitleNew(event.target.value)}
            />
            <button type="submit" className={a.auth__form__button} onClick={handleSubmit}>
                Войти
            </button>
        </form>
    )
}