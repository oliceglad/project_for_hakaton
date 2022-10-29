import React, {useState} from 'react';
import a from './Auth.module.scss';

export const Auth = () => {
    const [title, setTitle] = useState('')


    function handleSubmit(e) {
        console.log(title);
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
            />
            <button type="submit" className={a.auth__form__button} onClick={handleSubmit}>
                Войти
            </button>
        </form>
    )
}