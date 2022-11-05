import React from 'react';
import { useState } from 'react';
import f from './Main.module.scss';
import { YMaps, Map, Placemark } from "react-yandex-maps";
import Select from 'react-select'
import axios from 'axios'

export const Main = () => {
  const [valueCheck, setValueCheck] = useState(false);
  const [valueInput, setvalueInput] = useState('');
  const [valueFile, setvalueFile] = useState('');
  const [checkTorg, setCheckTorg] = useState(false);
  const [checkFloor, setCheckFloor] = useState(false);
  const [checkS, setCheckS] = useState(false);
  const [checkSKitchen, setCheckSKitchen] = useState(false);
  const [checkBalcon, setCheckBalcon] = useState(false);
  const [checkMetro, setCheckMetro] = useState(false);
  const [checkFinish, setCheckFinish] = useState(false);
  const [valueFloor, setValueFloor] = useState('');
  const [valueSquare, setValueSquare] = useState('');
  const [valueSelect, setValueSelect] = useState(null);
  const options = [
    { value: 1, label: 1 },
    { value: 2, label: 2 },
    { value: 3, label: 3 },
    { value: 4, label: 4 },
    { value: 5, label: 5 }
  ]


  const goServer = async () => {

    const formData = new FormData();
    formData.append('file', valueFile);

    try {
      await axios({
        url: 'https://google.com/',
        headers: {
          "Content-type": "application/json"
        },
        params: {
          file: formData,
          address: valueInput,
          floor: valueFloor,
          square: valueSquare,
          rooms: valueSelect,
          correctorBool: valueCheck,
          torg: checkTorg,
          checkFloor: checkFloor,
          checkSquare: checkS,
          kitchen: checkSKitchen,
          balcon: checkBalcon,
          metro: checkMetro,
          finishing: checkFinish
        },
        method: "GET",
        data: null
      }).then(({ data }) => {
        return data;
      })
    } catch (e) {
      console.log('Error', e)
    }
  }

  return (
    <div className={f.container}>
      <form className={f.form}>
        <div className={f.form__input__wrapper}>
          <input
            type="file"
            className={f.form__file}
            id='file' value={valueFile}
            onChange={(e) => setvalueFile(e.target.value)}
            accept='.xls, .xlsx' />
          <label for='file' className={f.form__file__style}>
            <span className={f.form__file__style__span}>{valueFile ? ' Успешно!' : 'Добавьте файл Excel'}</span>
          </label>
        </div>
        <input type="text" placeholder='Введите адрес' className={f.form__location} value={valueInput} onChange={(e) => setvalueInput(e.target.value)} />
        <div className={f.form__select}>
          <div className="square">
            <input type="text" placeholder='Введите этаж' className={f.form__location} style={{ width: '150px', marginRight: '15px' }} value={valueFloor} onChange={(e) => setValueFloor(e.target.value)} />
            <div className={f.form__select__square}>
              <input type="text" placeholder='Введите площадь' className={f.form__location} style={{ width: '150px' }} value={valueSquare} onChange={(e) => setValueSquare(e.target.value)} />
              <div style={{ fontSize: '10px', color: 'grey' }}>Пример: 85,0</div>
            </div>
          </div>
          <div className={f.form__select__rooms}>
            <Select options={options} defaultValue={valueSelect} onChange={(e) => setValueSelect(e.value)} placeholder='Кол-во комнат' styles={{ width: 100, }} />
          </div>
        </div>
        <label className={f.form__mainradio} for='corrector'>
          <input className={f.form__mainradio__check} type="checkbox" id='corrector' checked={valueCheck} onChange={() => setValueCheck(!valueCheck)} />
          <span>Учитывать корректировки</span>
        </label>
        <div className={f.form__title}>Корректировки: </div>

        <ul style={valueCheck ? { opacity: "1" } : { opacity: ".5" }}>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector1'>
              <input type="checkbox" id='corrector1' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkTorg} onChange={() => setCheckTorg(!checkTorg)} />
              <span>Корректировка на торг</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector2'>
              <input type="checkbox" id='corrector2' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkFloor} onChange={() => setCheckFloor(!checkFloor)} />
              <span>Корректировка на этаж расположения
                квартиры </span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector3'>
              <input type="checkbox" id='corrector3' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkS} onChange={() => setCheckS(!checkS)} />
              <span>Корректировка на площадь квартиры</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector4'>
              <input type="checkbox" id='corrector4' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkSKitchen} onChange={() => setCheckSKitchen(!checkSKitchen)} />
              <span>Корректировка на площадь кухни</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector5'>
              <input type="checkbox" id='corrector5' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkBalcon} onChange={() => setCheckBalcon(!checkBalcon)} />
              <span>Корректировка на наличие
                балкона / лоджии</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector6'>
              <input type="checkbox" id='corrector6' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkMetro} onChange={() => setCheckMetro(!checkMetro)} />
              <span> Корректировка на удаленность
                от станции метро</span>
            </label>
          </li>
          <li className={f.form__correctors__item}>
            <label className={f.form__correctors__item__label} for='corrector7'>
              <input type="checkbox" id='corrector7' disabled={valueCheck ? false : true} className={f.form__mainradio__check} checked={checkFinish} onChange={() => setCheckFinish(!checkFinish)} />
              <span>Корректировка на состояние отделки </span>
            </label>
          </li>
        </ul>

        <button type='button' className={f.form__button} onClick={goServer}>
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
                <Placemark geometry={[55.684758, 37.738521]} />
                <Placemark geometry={[55.684744, 37.738431]} />
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
            12 100 000 рублей
          </div>
        </div>

        <a href="##" download className={f.output__button}>
          Экспорт таблицы
        </a>
      </div>
    </div>
  )
}