import { Upload, Button, Icon } from 'antd';

const fileList = [{
  uid: '-1',
  name: 'xxx.png',
  status: 'done',
  url: 'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
  thumbUrl: 'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
}, {
  uid: '-2',
  name: 'yyy.png',
  status: 'done',
  url: 'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
  thumbUrl: 'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
}];

const props = {
  action: '//jsonplaceholder.typicode.com/posts/',
  listType: 'picture',
  defaultFileList: [...fileList],
};

const ImageUpload = () => {
  return (
    <div>
      <Upload {...props}>
        <Button>
          <Icon type="upload" /> Upload
        </Button>
      </Upload>
      <br />
    </div>
  )
}

export default ImageUpload
