import React from 'react';
import a from './Auth.module.scss';

export const Auth = () => {
    return (
        <form className={a.auth__form}>
            <input
                placeholder="Логин"
                className={a.auth__form__input}
                type="text"
                required
            />
            <input
                placeholder="Пароль"
                className={a.auth__form__input}
                type="text"
                required
            />
            <button type="submit" className={a.auth__form__button}>
                Войти
            </button>
        </form>
    )
}