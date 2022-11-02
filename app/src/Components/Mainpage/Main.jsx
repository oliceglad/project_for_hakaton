import React from 'react';
import { useState } from 'react';
import f from './Main.module.scss';
import { YMaps, Map, Placemark } from "react-yandex-maps";

export const Main = () => {

  const [valueCheck, setValueCheck] = useState(false);
  const [valueInput, setvalueInput] = useState('');
  const [valueFile, setvalueFile] = useState('');

  return (
    <div className={f.container}>
      <form className={f.form}>
        <div className={f.form__input__wrapper}>
          <input
            type="file"
            className={f.form__file}
            id='file' value={valueFile}
            onChange={(e) => setvalueFile(e.target.value)} />
          <label for='file' className={f.form__file__style}>
            <span className={f.form__file__style__span}>{valueFile ? valueFile : 'Добавьте файл Excel'}</span>
          </label>
        </div>
        <input type="text" placeholder='Введите местоположение' className={f.form__location} value={valueInput} onChange={(e) => setvalueInput(e.target.value)} />
        <label className={f.form__mainradio} for='corrector'>
          <input className={f.form__mainradio__check} type="checkbox" id='corrector' checked={valueCheck} onChange={() => setValueCheck(!valueCheck)} />
          <span>Учитывать корректировки</span>
        </label>
        <div className={f.form__title}>Корректировки: </div>

        <ul style={valueCheck ? { opacity: "1" } : { opacity: ".5" }}>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector1'>
              <input type="checkbox" id='corrector1' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на торг</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector2'>
              <input type="checkbox" id='corrector2' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на этаж расположения
                квартиры </span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector3'>
              <input type="checkbox" id='corrector3' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на площадь квартиры</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector4'>
              <input type="checkbox" id='corrector4' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на площадь кухни</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector5'>
              <input type="checkbox" id='corrector5' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на наличие
                балкона / лоджии</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector6'>
              <input type="checkbox" id='corrector6' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span> Корректировка на удаленность
                от станции метро</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector7'>
              <input type="checkbox" id='corrector7' disabled={valueCheck ? false : true} className={f.form__mainradio__check} />
              <span>Корректировка на состояние отделки </span>
            </label>
          </li>
        </ul>

        <button type='submit' className={f.form__button}>
          Рассчитать
        </button>
      </form>

      <div className={f.output}>
        <div className={f.output__address}>
          <div className={f.output__address__title}>
            Ваш введенный адрес:
          </div>
          <div className={f.output__address__info}>
            {valueInput ? valueInput : 'none'}
          </div>
        </div>
        <div className={f.output__map}>
          <div className={f.output__map__title}>
            Найдено несколько аналогов:
          </div>
          <div>
            <YMaps>
              <Map defaultState={{
                center: [55.751574, 37.573856],
                zoom: 10,
              }} className={f.output__map__map}>
                <Placemark geometry={[54.684758, 37.738521]} />
                <Placemark geometry={[53.684744, 37.738431]} />
                <Placemark geometry={[55.684333, 37.733521]} />
              </Map>
            </YMaps>
          </div>

        </div>

        <label className={f.output__map__check} for='corrector10'>
          <input type="checkbox" id='corrector10' className={f.form__mainradio__check} />
          <span>Учитывать подобранные аналоги</span>
        </label>

        <div className={f.output__cost}>
          <div className={f.output__cost_title}>
            Расчетная стоимость
          </div>
          <div className={f.output__cost__info}>
            25,4млн рублей
          </div>
        </div>

        <a href="##" className={f.output__button}>
          Экспорт таблицы
        </a>
      </div>
    </div>
  )
}