import { Select } from 'antd';
import React from 'react';
import styles from '@/components/InputStyle.css';

const Option = Select.Option;

function handleChange(value) {
  console.log(`selected ${value}`);
}

const HouseTypeSelector = ({labelText}) => {
  return (
    <div className={styles.inputbg}>
      <label className={styles.labelstyle}>{labelText}</label>
      <Select defaultValue="lucy" style={{ width: 120 }} onChange={handleChange}>
        <Option value="jack">住宅</Option>
        <Option value="lucy">公寓</Option>
        <Option value="disabled">商铺</Option>
      </Select>
    </div>
  )
}

export default HouseTypeSelector
