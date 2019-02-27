import {Button} from 'antd';
import React from 'react';
import InputStyle from '@/components/InputStyle';
import HouseTypeSelector from '@/components/HouseTypeSelector';
import ImageUpload from '@/components/ImageUpLoad';

const AddHouseItem =()  => {
  return (
    <div>
      <InputStyle labelText='房源名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源用户名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源置业顾问名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源描述' innerText='请输入房源名称'/>
      <InputStyle labelText='房源面积' innerText='请输入房源名称'/>
      <InputStyle labelText='房源名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源名称' innerText='请输入房源名称'/>
      <InputStyle labelText='房源名称' innerText='请输入房源名称'/>
      <HouseTypeSelector labelText='房源类型'/>
      <ImageUpload/>
      <Button htmlType={Button}><a href='/housedetails'>确认</a></Button>
      <Button htmlType={Button}>取消</Button>
    </div>
  )
}

export default AddHouseItem
