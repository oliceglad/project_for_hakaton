import React from 'react';
import { useState } from 'react';
import f from './Main.module.scss';


export const Main = () => {

    const[valueCheck, setValueCheck] = useState(false);
    return (
        <form className={f.form}>
            <input type="file" className={f.form__file} />
            <input type="text" placeholder='Введите местоположение' className={f.form__location} />
            <label className={f.form__mainradio} for='corrector'>
                <input type="checkbox" id='corrector' checked={valueCheck} onChange={() => setValueCheck(!valueCheck)}/>
                <span>Учитывать корректировки</span>
            </label>
            <div className={f.form__title}>Корректировки: </div>

            <ul style={valueCheck ? {opacity: "1"}: {opacity: ".5"}}>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector1'>
                        <input type="checkbox" id='corrector1' disabled={valueCheck ? false: true}/>
                        <span>Корректировка на торг</span>
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector2'>
                        <input type="checkbox" id='corrector2' disabled={valueCheck ? false: true}/>
                        <span>Корректировка на этаж расположения
                        квартиры </span>
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector3'>
                        <input type="checkbox" id='corrector3' disabled={valueCheck ? false: true}/>
                       <span>Корректировка на площадь квартиры</span>
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector4'>
                        <input type="checkbox" id='corrector4' disabled={valueCheck ? false: true}/>
                        <span>Корректировка на площадь кухни</span>
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector5'>
                        <input type="checkbox" id='corrector5' disabled={valueCheck ? false: true}/>
                       <span>Корректировка на наличие
                        балкона / лоджии</span> 
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector6'>
                        <input type="checkbox" id='corrector6' disabled={valueCheck ? false: true}/>
                       <span> Корректировка на удаленность
                        от станции метро</span>
                    </label>
                </li>
                <li className={f.form__correctors__item}>
                    <label className={f.form__correctors__item__label} for='corrector7'>
                        <input type="checkbox" id='corrector7' disabled={valueCheck ? false: true}/>
                        <span>Корректировка на состояние отделки </span>
                    </label>
                </li>
            </ul>
        </form>
    )
}